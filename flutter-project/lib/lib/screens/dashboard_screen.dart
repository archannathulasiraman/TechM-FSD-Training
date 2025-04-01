import 'package:flutter/material.dart';
import 'package:firebase_auth/firebase_auth.dart';
import 'package:provider/provider.dart';
import '../services/auth_service.dart';

class DashboardScreen extends StatelessWidget {
  const DashboardScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final authService = Provider.of<AuthService>(context, listen: false);
    final User? user = authService.currentUser;

    return Scaffold(
      appBar: AppBar(
        title: const Text("Career Path Navigator"),
        actions: [
          IconButton(
            icon: const Icon(Icons.logout),
            onPressed: () async {
              await authService.signOut();
              Navigator.pushReplacementNamed(context, '/login');
            },
          ),
        ],
      ),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              "Welcome, ${user?.displayName ?? user?.email ?? "User"}!",
              style: const TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),
            Text(
              "Explore your career path with personalized recommendations.",
              style: const TextStyle(fontSize: 16, color: Colors.grey),
            ),
            const SizedBox(height: 20),
            Expanded(
              child: GridView.count(
                crossAxisCount: 2,
                crossAxisSpacing: 10,
                mainAxisSpacing: 10,
                children: [
                  _buildDashboardCard(
                    context,
                    title: "Career Paths",
                    icon: Icons.work,
                    route: "/career_paths",
                  ),
                  _buildDashboardCard(
                    context,
                    title: "Skill Assessment",
                    icon: Icons.quiz,
                    route: "/skill_assessment",
                  ),
                  _buildDashboardCard(
                    context,
                    title: "Job Listings",
                    icon: Icons.business_center,
                    route: "/jobs",
                  ),
                  _buildDashboardCard(
                    context,
                    title: "Resume Builder",
                    icon: Icons.description,
                    route: "/resume_builder",
                  ),
                  _buildDashboardCard(
                    context,
                    title: "Mentorship",
                    icon: Icons.people,
                    route: "/mentorship",
                  ),
                  _buildDashboardCard(
                    context,
                    title: "Profile",
                    icon: Icons.person,
                    route: "/profile",
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildDashboardCard(BuildContext context, {required String title, required IconData icon, required String route}) {
    return GestureDetector(
      onTap: () {
        Navigator.pushNamed(context, route);
      },
      child: Card(
        elevation: 4,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(icon, size: 50, color: Colors.blue),
            const SizedBox(height: 10),
            Text(title, style: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
          ],
        ),
      ),
    );
  }
}
