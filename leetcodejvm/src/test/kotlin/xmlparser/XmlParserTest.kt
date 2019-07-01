package xmlparser

import org.junit.Test

class XmlParserTest {

    private val test1 = "<html><body><p>hello</p></body></html>"

    private val mParser = XmlParser()

    @Test
    fun read() {
        mParser.read(test1.toCharArray())
    }
}