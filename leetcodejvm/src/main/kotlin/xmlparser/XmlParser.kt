package xmlparser

class XmlParser {

    private var mCurrentState: IState = DataState()

    fun read(charArray: CharArray) {
        charArray.forEach {
            read(it)
        }
    }

    fun read(char: Char) {
        mCurrentState.readNext(char)
    }


    interface IState {
        fun readNext(c: Char)
    }

    inner class TagOpen : IState {
        override fun readNext(c: Char) {
            mCurrentState = if (c == '/') {
                EndTagOpen()
            } else {
                TagName().apply { readNext(c) }
            }
        }

    }

    inner class EndTagOpen : IState {
        override fun readNext(c: Char) {
            mCurrentState = TagName().apply { readNext(c) }
        }

    }

    inner class TagName : IState {
        private val list = mutableListOf<Char>()

        override fun readNext(c: Char) {
            when (c) {
                '>' -> {
                    mCurrentState = DataState()
                    print(list.toString())
                }
                else -> list.add(c)
            }
        }

    }

    inner class DataState : IState {
        private val list = mutableListOf<Char>()
        override fun readNext(c: Char) {
            when (c) {
                '<' -> {
                    mCurrentState = TagOpen()
                    print(list.toString())
                }
                else -> {
                    list.add(c)
                }
            }
        }

    }
}
