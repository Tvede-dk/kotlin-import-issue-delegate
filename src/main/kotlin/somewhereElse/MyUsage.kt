package somewhereElse

import javafx.beans.property.DoublePropertyBase
//import other.getValue
//import other.setValue

class MyUsage {
    val myObs1 = ForFun()
    val myObs2 = object: DoublePropertyBase(2.0){
        override fun getName(): String {
            TODO("Not yet implemented")
        }

        override fun getBean(): Any? {
            TODO("Not yet implemented")
        }

    }
    var myIssue1: Double? by myObs1
    var myIssue2: Double? by myObs2
}


class ForFun: DoublePropertyBase(2.0){
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getBean(): Any? {
        TODO("Not yet implemented")
    }
}