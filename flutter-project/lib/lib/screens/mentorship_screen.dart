import 'package:flutter/material.dart';

class MentorshipScreen extends StatelessWidget {
  const MentorshipScreen({super.key});

  @override
  Widget build(BuildContext context) {
    // Sample mentor data
    final List<Map<String, String>> mentors = [
      {
        'name': 'Dr. A.P.J. Abdul Kalam',
        'expertise': 'Aerospace Engineering',
        'experience': '40+ years',
      },
      {
        'name': 'Elon Musk',
        'expertise': 'Entrepreneurship & AI',
        'experience': '25+ years',
      },
      {
        'name': 'Sundar Pichai',
        'expertise': 'Technology & Leadership',
        'experience': '20+ years',
      },
    ];

    return Scaffold(
      appBar: AppBar(title: const Text('Mentorship Program')),
      body: ListView.builder(
        itemCount: mentors.length,
        itemBuilder: (context, index) {
          final mentor = mentors[index];

          return Card(
            margin: const EdgeInsets.symmetric(horizontal: 10, vertical: 5),
            child: ListTile(
              leading: const CircleAvatar(child: Icon(Icons.person)),
              title: Text(mentor['name']!, style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
              subtitle: Text('${mentor['expertise']} • ${mentor['experience']}'),
              trailing: ElevatedButton(
                onPressed: () {
                  // Placeholder for mentorship request action
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Requested mentorship from ${mentor['name']}')),
                  );
                },
                child: const Text('Request'),
              ),
            ),
          );
        },
      ),
    );
  }
}
