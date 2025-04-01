import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:firebase_auth/firebase_auth.dart';
import 'package:provider/provider.dart';
import 'services/auth_service.dart';
import 'screens/login_screen.dart';
import 'screens/dashboard_screen.dart';
import 'screens/career_paths_screen.dart';
import 'screens/skill_assessment_screen.dart';
import 'screens/job_listings_screen.dart';
import 'screens/resume_builder_screen.dart';
import 'screens/mentorship_screen.dart';
import 'screens/profile_screen.dart';
import 'firebase_options.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        ChangeNotifierProvider<AuthService>(
          create: (context) => AuthService(),
        ),
      ],
      child: MaterialApp(
        title: 'Career Path Navigator',
        theme: ThemeData(primarySwatch: Colors.blue),
        debugShowCheckedModeBanner: false,
        home: const AuthWrapper(), // Handles authentication state
        routes: {
          '/dashboard': (context) => const DashboardScreen(),
          '/career_paths': (context) => CareerPathsScreen(),
          '/skill_assessment': (context) => const SkillAssessmentScreen(),
          '/jobs': (context) => const JobListingsScreen(),
          '/resume_builder': (context) => const ResumeBuilderScreen(),
          '/mentorship': (context) => const MentorshipScreen(),
          '/profile': (context) => const ProfileScreen(),
        },
      ),
    );
  }
}

// Authentication Wrapper - Redirects based on login state
class AuthWrapper extends StatelessWidget {
  const AuthWrapper({super.key});

  @override
  Widget build(BuildContext context) {
    return StreamBuilder<User?>(
      stream: FirebaseAuth.instance.authStateChanges(),
      builder: (context, snapshot) {
        if (snapshot.connectionState == ConnectionState.active) {
          return snapshot.hasData ? const DashboardScreen() : const LoginScreen();
        }
        return const Scaffold(
          body: Center(child: CircularProgressIndicator()),
        );
      },
    );
  }
}
