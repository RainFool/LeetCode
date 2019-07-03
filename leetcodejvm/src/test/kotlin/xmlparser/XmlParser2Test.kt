package xmlparser

import org.junit.Test

import org.junit.Assert.*

class XmlParser2Test {

    private val test1 = "<html><body><p>hello</p></body></html>"

    private val mParser = XmlParser2()

    @Test
    fun parse() {
        mParser.parse(test1.toList())
    }
}