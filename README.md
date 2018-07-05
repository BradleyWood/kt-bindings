# kt-bindings

This project consists of a set of Kotlin bindings for popular JavaScript libraries


# Projects

 - [kt-bindings-codemirror](kt-bindings-codemirror/src/main/kotlin/bindings/codemirror/) - a versatile text editor
 
 - TODO
 

# Examples

### CodeMirror

 ```kotlin
import bindings.codemirror.CodeMirror
import kotlin.browser.document

fun main(args: Array<String>) {
    val codeMirror = CodeMirror(document.getElementById("code")!!, object {
        val mode = "text/x-kotlin"
        val lineNumbers = true
    })
    codeMirror.setSize("100%", "100%")
    codeMirror.setValue("\nfun main(args: Array<String>) { \n\tprintln(\"Hello, World\")\n}\n")
}

```


<p align="center">
    <img src="https://github.com/BradleyWood/kt-bindings/blob/master/images/CodeMirror-Example.png?raw=true">
</p>
