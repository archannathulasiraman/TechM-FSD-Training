import 'package:firebase_auth/firebase_auth.dart';
import 'package:google_sign_in/google_sign_in.dart';
import 'package:flutter/foundation.dart';

class AuthService extends ChangeNotifier {
  final FirebaseAuth _auth = FirebaseAuth.instance;

  // ✅ Stream for Auth State Changes
  Stream<User?> get authStateChanges => _auth.authStateChanges();

  // ✅ Get Current User
  User? get currentUser => _auth.currentUser;

  // ✅ Sign Up with Email & Password
  Future<User?> signUpWithEmail(String email, String password) async {
    try {
      UserCredential userCredential = await _auth.createUserWithEmailAndPassword(
        email: email,
        password: password,
      );
      notifyListeners();
      print("✅ User Registered: ${userCredential.user?.email}");
      return userCredential.user;
    } on FirebaseAuthException catch (e) {
      print("❌ Sign Up Error: ${e.code} - ${e.message}");
      return null;
    }
  }

  // ✅ Sign In with Email & Password
  Future<User?> signInWithEmail(String email, String password) async {
    try {
      UserCredential userCredential = await _auth.signInWithEmailAndPassword(
        email: email,
        password: password,
      );
      print("✅ Login Successful: ${userCredential.user?.email}");
      return userCredential.user;
    } on FirebaseAuthException catch (e) {
      print("❌ Login Error: ${e.code} - ${e.message}");

      // ✅ Automatically create a test user if not found
      if (e.code == "user-not-found") {
        print("⚠️ No account found. Creating test user...");
        return await _createTestUser(email, password);
      }

      return null;
    }
  }

  // ✅ Sign In with Google
  Future<User?> signInWithGoogle() async {
    try {
      final GoogleSignInAccount? googleUser = await GoogleSignIn().signIn();
      if (googleUser == null) {
        print("❌ Google Sign-In Cancelled");
        return null;
      }

      final GoogleSignInAuthentication googleAuth = await googleUser.authentication;
      final AuthCredential credential = GoogleAuthProvider.credential(
        accessToken: googleAuth.accessToken,
        idToken: googleAuth.idToken,
      );

      UserCredential userCredential = await _auth.signInWithCredential(credential);
      print("✅ Google Sign-In Successful: ${userCredential.user?.email}");
      notifyListeners();
      return userCredential.user;
    } on FirebaseAuthException catch (e) {
      print("❌ Google Sign-In Error: ${e.message}");
      return null;
    }
  }

  // ✅ Sign Out
  Future<void> signOut() async {
    try {
      await _auth.signOut();
      await GoogleSignIn().signOut();
      print("✅ User Signed Out");
      notifyListeners();
    } catch (e) {
      print("❌ Sign Out Error: $e");
    }
  }

  // ✅ Automatically create a default test user (Fix for "Invalid Credentials")
  Future<User?> _createTestUser(String email, String password) async {
    try {
      UserCredential userCredential = await _auth.createUserWithEmailAndPassword(
        email: email,
        password: password,
      );
      print("✅ Test User Created: $email");
      return userCredential.user;
    } on FirebaseAuthException catch (e) {
      print("❌ Error Creating Test User: ${e.message}");
      return null;
    }
  }
}
