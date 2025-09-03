# Response to Issue #4: "Cannot load such file -- highline/import (LoadError)"

## Issue Analysis

The error reported in Issue #4 appears to be related to a Ruby script called `drupalgeddon2.rb`, but this repository (`artsploit/yaml-payload`) is a **Java project** for generating SnakeYAML deserialization payloads.

## Repository Purpose

This repository contains:
- Java code for SnakeYAML exploitation payloads
- A `ScriptEngineFactory` implementation for payload execution
- Build instructions for creating JAR files
- **No Ruby code or dependencies**

## The Actual Issue

The error you're encountering:
```
cannot load such file -- highline/import (LoadError)
```

This is a Ruby dependency issue where the `highline` gem is not installed or not properly configured.

## Solution for Your Ruby Issue

To fix the `highline/import` LoadError, you need to install the `highline` gem:

### Option 1: Install using gem
```bash
gem install highline
```

### Option 2: Install using bundler (if you have a Gemfile)
```bash
bundle install
```

### Option 3: Install system-wide (if you need root privileges)
```bash
sudo gem install highline
```

## Recommendation

1. **This issue should be filed in the correct repository** - likely the repository that contains the `drupalgeddon2.rb` script
2. **Install the missing Ruby dependency** using one of the methods above
3. **Verify your Ruby environment** has all required dependencies

## About This Repository

If you're interested in YAML deserialization payloads (the actual purpose of this repo), you can:

1. Compile the Java code:
   ```bash
   javac src/artsploit/AwesomeScriptEngineFactory.java
   ```

2. Create the payload JAR:
   ```bash
   jar -cvf yaml-payload.jar -C src/ .
   ```

3. Use the generated YAML payload as documented in the README.md

---

**Note**: This response addresses the mismatch between the reported issue and the repository's actual purpose.