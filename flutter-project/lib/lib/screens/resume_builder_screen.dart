import 'package:flutter/material.dart';

class ResumeBuilderScreen extends StatefulWidget {
  const ResumeBuilderScreen({super.key});

  @override
  _ResumeBuilderScreenState createState() => _ResumeBuilderScreenState();
}

class _ResumeBuilderScreenState extends State<ResumeBuilderScreen> {
  final _formKey = GlobalKey<FormState>();

  // Controllers for text fields
  final TextEditingController _nameController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _phoneController = TextEditingController();
  final TextEditingController _skillsController = TextEditingController();
  final TextEditingController _experienceController = TextEditingController();
  final TextEditingController _educationController = TextEditingController();

  @override
  void dispose() {
    _nameController.dispose();
    _emailController.dispose();
    _phoneController.dispose();
    _skillsController.dispose();
    _experienceController.dispose();
    _educationController.dispose();
    super.dispose();
  }

  void _previewResume() {
    if (_formKey.currentState!.validate()) {
      showDialog(
        context: context,
        builder: (context) {
          return AlertDialog(
            title: const Text("Resume Preview"),
            content: SingleChildScrollView(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text("📌 Name: ${_nameController.text}"),
                  Text("📧 Email: ${_emailController.text}"),
                  Text("📞 Phone: ${_phoneController.text}"),
                  Text("💡 Skills: ${_skillsController.text}"),
                  Text("💼 Experience: ${_experienceController.text}"),
                  Text("🎓 Education: ${_educationController.text}"),
                ],
              ),
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(context),
                child: const Text("Close"),
              ),
            ],
          );
        },
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Resume Builder")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: SingleChildScrollView(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  "Enter your details to generate a resume:",
                  style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 16),

                // Name Field
                TextFormField(
                  controller: _nameController,
                  decoration: const InputDecoration(labelText: "Full Name"),
                  validator: (value) => value!.isEmpty ? "Enter your name" : null,
                ),
                const SizedBox(height: 10),

                // Email Field
                TextFormField(
                  controller: _emailController,
                  decoration: const InputDecoration(labelText: "Email"),
                  validator: (value) => value!.isEmpty ? "Enter your email" : null,
                ),
                const SizedBox(height: 10),

                // Phone Field
                TextFormField(
                  controller: _phoneController,
                  decoration: const InputDecoration(labelText: "Phone"),
                  validator: (value) => value!.isEmpty ? "Enter your phone number" : null,
                ),
                const SizedBox(height: 10),

                // Skills Field
                TextFormField(
                  controller: _skillsController,
                  decoration: const InputDecoration(labelText: "Skills (comma separated)"),
                ),
                const SizedBox(height: 10),

                // Experience Field
                TextFormField(
                  controller: _experienceController,
                  decoration: const InputDecoration(labelText: "Experience"),
                ),
                const SizedBox(height: 10),

                // Education Field
                TextFormField(
                  controller: _educationController,
                  decoration: const InputDecoration(labelText: "Education"),
                ),
                const SizedBox(height: 20),

                // Preview Button
                ElevatedButton(
                  onPressed: _previewResume,
                  child: const Text("Preview Resume"),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
