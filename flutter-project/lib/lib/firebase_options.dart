import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/foundation.dart';

class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    return const FirebaseOptions(
      apiKey: "your-api-key",
      appId: "your-app-id",
      messagingSenderId: "your-messaging-sender-id",
      projectId: "your-project-id",
      storageBucket: "your-storage-bucket",
      authDomain: "your-auth-domain",
    );
  }
}
