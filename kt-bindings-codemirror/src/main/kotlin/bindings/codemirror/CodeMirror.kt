package bindings.codemirror

import org.w3c.dom.Element
import org.w3c.dom.HTMLTextAreaElement

@JsNonModule
@JsModule("codemirror")
external class CodeMirror(e: Element, options: Any = definedExternally) {

    companion object {
        var version: String
        var defaults: Any
        fun fromTextArea(textArea: HTMLTextAreaElement, config: Any = definedExternally): CodeMirror
        fun defineMode(name: String, value: Any)
        fun defineExtension(name: String, value: Any)
        fun registerHelper(type: String, name: String, value: Function<Any>)
        class Pos(line: Int, ch: Int)
    }

    fun getValue(separator: String = definedExternally): String
    fun setValue(content: String)
    fun getRange(from: Pos, to: Pos, separator: String = definedExternally): String
    fun replaceRange(replacement: String, from: Pos, to: Pos, origin: String = definedExternally)
    fun getLine(n: Int): String
    fun lineCount(): Int
    fun firstLine(): Int
    fun lastLine(): Int
    fun getLineHandle(num: Int): Any // LineHandle
    fun getLineNumber(handle: Any): Int

    fun markClean()

    fun changeGeneration(closeEvent: Boolean = definedExternally)
    fun isClean(generation: Int = definedExternally): Boolean
    fun getSelection(lineSep: String = definedExternally): String
    fun getSelections(lineSep: String = definedExternally): Array<String>
    fun replaceSelection(replacement: String, select: String = definedExternally)
    fun replaceSelections(replacements: Array<String>, select: String = definedExternally)
    fun setSize(width: Number, height: Number)
    fun setSize(width: String, height: String)
    fun refresh()

    fun setOption(option: String, value: Any)

    fun getOption(option: String): Any
    fun addKeyMap(map: Any, bottom: Boolean)
    fun removeKeyMap(map: Any)

    fun on(type: String, func: Function<Any>)

    fun off(type: String, func: Function<Any>)
    fun markText(from: Pos, to: Pos, options: Any = definedExternally): Any // TextMarker
}
