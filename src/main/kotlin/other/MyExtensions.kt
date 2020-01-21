package other

import javafx.beans.binding.DoubleExpression
import javafx.beans.value.WritableValue
import kotlin.reflect.KProperty

operator fun <T> WritableValue<T>.setValue(container: Any, property: KProperty<*>, value: T) = setValue(value)

operator fun <T> DoubleExpression.getValue(from: T, property: KProperty<*>): Double? = value