package xmlparser

class XmlParser2() {

    private var mCurrentState = 0

    private val mStartList = mutableListOf<Char>()
    private val mEndList = mutableListOf<Char>()
    private val mDataList = mutableListOf<Char>()

    fun parse(charArray: List<Char>): Node {
        if (charArray.contains('<')) {
            return Node(charArray.joinToString(""))
        }
        val it = charArray.iterator()
        while (it.hasNext()) {
            val c = it.next()
            if (c == '<') {
                mCurrentState = 1
                continue
            } else if (c == '/') {
                mCurrentState == 2
                continue
            } else if (c == '>' && mStartList == mEndList) {
                mCurrentState == 0

                continue
            }
            if (mCurrentState == 1) {
                mStartList.add(c)
            } else if (mCurrentState == 2) {
                mEndList.add(c)
            } else {
                mDataList.add(c)
            }
        }
    }
}

data class Node(val name: String, val children: List<Node> = listOf()) {
}