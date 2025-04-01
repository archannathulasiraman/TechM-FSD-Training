import 'package:flutter/material.dart';
import 'package:career_path_navigator/models/skill.dart'; // ✅ Correct Import

class SkillAssessmentScreen extends StatefulWidget {
  const SkillAssessmentScreen({super.key});

  @override
  _SkillAssessmentScreenState createState() => _SkillAssessmentScreenState();
}

class _SkillAssessmentScreenState extends State<SkillAssessmentScreen> {
  // Sample skills with default proficiency
  List<Skill> skills = [
    Skill(name: "Programming", proficiency: 5),
    Skill(name: "Problem-Solving", proficiency: 5),
    Skill(name: "Data Structures", proficiency: 5),
    Skill(name: "Communication", proficiency: 5),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Skill Assessment')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            const Text(
              "Rate Your Skills (1-10)",
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),

            // Skill List
            Expanded(
              child: ListView.builder(
                itemCount: skills.length,
                itemBuilder: (context, index) {
                  return Card(
                    child: ListTile(
                      title: Text(
                        skills[index].name,
                        style: const TextStyle(fontSize: 16, fontWeight: FontWeight.w500),
                      ),
                      subtitle: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text("Proficiency: ${skills[index].proficiency}/10"),
                          Slider(
                            value: skills[index].proficiency.toDouble(),
                            min: 1,
                            max: 10,
                            divisions: 9,
                            label: skills[index].proficiency.toString(),
                            onChanged: (value) {
                              setState(() {
                                skills[index].proficiency = value.toInt();
                              });
                            },
                          ),
                        ],
                      ),
                    ),
                  );
                },
              ),
            ),

            const SizedBox(height: 10),

            // Save Button
            ElevatedButton(
              onPressed: () {
                _saveSkills();
                Navigator.pop(context); // ✅ Navigate back after saving
              },
              child: const Text("Save Assessment"),
            ),
          ],
        ),
      ),
    );
  }

  // Save function (Dummy for now, can connect to Firestore later)
  void _saveSkills() {
    for (var skill in skills) {
      print("${skill.name}: ${skill.proficiency}/10");
    }
    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text("Skills saved successfully!")),
    );
  }
}
