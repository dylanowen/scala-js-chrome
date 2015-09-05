package chrome.runtime.bindings

import scala.scalajs.js

@js.native
trait ConnectInfo extends js.Object {

  def name: js.UndefOr[String] = js.native

  def includeTlsChannelId: js.UndefOr[Boolean] = js.native

}
