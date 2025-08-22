import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable("root") {
        Style {
            body {
                margin(0.px)
                padding(0.px)
            }
            ".dashboard" {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
                justifyContent(JustifyContent.SpaceEvenly)
                alignItems(AlignItems.Center)
                padding(20.px)
                width(100.vw)
                height(100.vh)
                backgroundColor(rgb(240, 240, 240))
            }
            ".card" {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                justifyContent(JustifyContent.SpaceBetween)
                alignItems(AlignItems.Center)
                padding(20.px)
                backgroundColor(rgb(255, 255, 255))
                borderRadius(10.px)
                boxShadow("0px 0px 10px rgba(0,0,0,0.2)")
                width(300.px)
                height(150.px)
                margin(20.px)
            }
        }
        Div(attrs = {
            classes("dashboard")
        }) {
            Div(attrs = {
                classes("card")
            }) {
                // Card 1 Content
            }
            Div(attrs = {
                classes("card")
            }) {
                // Card 2 Content
            }
            Div(attrs = {
                classes("card")
            }) {
                // Card 3 Content
            }
        }
    }
}

fun StyleScope.body(init: RuleSet) {
    selector("body", init)
}

fun StyleScope.margin(value: CSSLengthValue) {
    property("margin", value)
}

fun StyleScope.padding(value: CSSLengthValue) {
    property("padding", value)
}

fun StyleScope.width(value: CSSLengthValue) {
    property("width", value)
}

fun StyleScope.height(value: CSSLengthValue) {
    property("height", value)
}

fun StyleScope.display(value: DisplayStyle) {
    property("display", value.value)
}

fun StyleScope.flexDirection(value: FlexDirection) {
    property("flexDirection", value.value)
}

fun StyleScope.justifyContent(value: JustifyContent) {
    property("justifyContent", value.value)
}

fun StyleScope.alignItems(value: AlignItems) {
    property("alignItems", value.value)
}

fun StyleScope.backgroundColor(value: Color) {
    property("backgroundColor", value.toString())
}

fun StyleScope.borderRadius(value: CSSLengthValue) {
    property("borderRadius", value)
}

fun StyleScope.boxShadow(value: String) {
    property("boxShadow", value)
}

enum class DisplayStyle(val value: String) {
    Flex("flex"),
    Block("block"),
    Inline("inline"),
    InlineBlock("inline-block"),
    None("none")
}

enum class FlexDirection(val value: String) {
    Row("row"),
    Column("column"),
    RowReverse("row-reverse"),
    ColumnReverse("column-reverse")
}

enum class JustifyContent(val value: String) {
    FlexStart("flex-start"),
    Center("center"),
    FlexEnd("flex-end"),
    SpaceBetween("space-between"),
    SpaceAround("space-around"),
    SpaceEvenly("space-evenly")
}

enum class AlignItems(val value: String) {
    FlexStart("flex-start"),
    Center("center"),
    FlexEnd("flex-end"),
    Baseline("baseline"),
    Stretch("stretch")
}