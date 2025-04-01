import 'package:flutter/material.dart';

class JobListingsScreen extends StatelessWidget {
  const JobListingsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    // Sample job data
    final List<Map<String, String>> jobs = [
      {
        'title': 'Software Engineer',
        'company': 'Google',
        'location': 'Mountain View, CA',
      },
      {
        'title': 'Data Scientist',
        'company': 'Microsoft',
        'location': 'Redmond, WA',
      },
      {
        'title': 'UI/UX Designer',
        'company': 'Apple',
        'location': 'Cupertino, CA',
      },
    ];

    return Scaffold(
      appBar: AppBar(title: const Text('Job Listings')),
      body: ListView.builder(
        itemCount: jobs.length,
        itemBuilder: (context, index) {
          final job = jobs[index];

          return Card(
            margin: const EdgeInsets.symmetric(horizontal: 10, vertical: 5),
            child: ListTile(
              title: Text(job['title']!, style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
              subtitle: Text('${job['company']} • ${job['location']}'),
              trailing: ElevatedButton(
                onPressed: () {
                  // Placeholder for job application action
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Applied for ${job['title']} at ${job['company']}')),
                  );
                },
                child: const Text('Apply'),
              ),
            ),
          );
        },
      ),
    );
  }
}
