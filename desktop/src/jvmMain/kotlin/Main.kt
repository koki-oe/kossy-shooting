import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import jp.waseda.fuji.kokioe.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
