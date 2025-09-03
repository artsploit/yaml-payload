# Frequently Asked Questions

## Wrong Repository Issues

### Q: I'm getting a Ruby LoadError when running drupalgeddon2.rb, can you help?

**A:** This repository (`artsploit/yaml-payload`) is specifically for **Java-based SnakeYAML deserialization payloads**. If you're experiencing issues with Ruby scripts like `drupalgeddon2.rb`, you've likely filed your issue in the wrong repository.

**For Ruby dependency issues like `highline/import` LoadError:**
```bash
gem install highline
```

### Q: What is this repository for?

**A:** This repository provides tools for generating SnakeYAML deserialization exploit payloads. It contains:
- Java code that gets executed when the YAML payload is deserialized
- Instructions for compiling and hosting the payload
- Example YAML payload format

### Q: How do I use this repository?

**A:** Follow these steps:

1. **Modify the payload code** in `src/artsploit/AwesomeScriptEngineFactory.java`
2. **Compile the code:**
   ```bash
   javac src/artsploit/AwesomeScriptEngineFactory.java
   ```
3. **Create the JAR:**
   ```bash
   jar -cvf yaml-payload.jar -C src/ .
   ```
4. **Host the JAR** on a web server
5. **Use the YAML payload** as shown in README.md

### Q: Can I report issues unrelated to SnakeYAML payloads here?

**A:** No, please ensure your issue is related to this specific repository's purpose. For other tools or scripts, find their appropriate repositories or create issues in the correct location.

## Getting Help

- **For YAML payload issues**: Open an issue in this repository
- **For Ruby/Python/other language issues**: Find the appropriate repository for that tool
- **For general security questions**: Consider security-focused forums or communities