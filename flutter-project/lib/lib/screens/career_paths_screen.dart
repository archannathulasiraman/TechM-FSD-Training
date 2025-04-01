import 'package:flutter/material.dart';

class CareerPathsScreen extends StatelessWidget {
  CareerPathsScreen({super.key});

  // Dummy Career Paths Data
  final List<Map<String, String>> careerPaths = [
    {
      "title": "Software Engineer",
      "description": "Develops software applications using programming languages.",
      "skills": "Python, Java, C++, Problem-solving",
      "salary": "\$80,000 - \$120,000 per year"
    },
    {
      "title": "Data Scientist",
      "description": "Analyzes data to extract insights using machine learning.",
      "skills": "Python, SQL, Machine Learning, Statistics",
      "salary": "\$90,000 - \$140,000 per year"
    },
    {
      "title": "UI/UX Designer",
      "description": "Designs user-friendly interfaces and enhances user experience.",
      "skills": "Figma, Adobe XD, Sketch, Design Thinking",
      "salary": "\$60,000 - \$100,000 per year"
    },
    {
      "title": "Cybersecurity Analyst",
      "description": "Protects systems from cyber threats and attacks.",
      "skills": "Networking, Cryptography, Security Tools",
      "salary": "\$85,000 - \$130,000 per year"
    }
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Career Paths")),
      body: ListView.builder(
        itemCount: careerPaths.length,
        itemBuilder: (context, index) {
          return Card(
            margin: const EdgeInsets.all(10),
            child: ListTile(
              title: Text(careerPaths[index]['title']!),
              subtitle: Text(careerPaths[index]['description']!),
              trailing: const Icon(Icons.arrow_forward),
              onTap: () {
                // Navigate to details page
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => CareerDetailsScreen(career: careerPaths[index]),
                  ),
                );
              },
            ),
          );
        },
      ),
    );
  }
}

// Career Details Screen
class CareerDetailsScreen extends StatelessWidget {
  final Map<String, String> career;
  
  const CareerDetailsScreen({super.key, required this.career});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(career['title']!)),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              career['title']!,
              style: const TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),
            Text("📌 ${career['description']}"),
            const SizedBox(height: 10),
            Text("💡 Skills Required: ${career['skills']}"),
            const SizedBox(height: 10),
            Text("💰 Expected Salary: ${career['salary']}"),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () => Navigator.pop(context),
              child: const Text("Back to Career Paths"),
            ),
          ],
        ),
      ),
    );
  }
}
