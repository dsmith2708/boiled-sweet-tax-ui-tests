/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

object CheckConfirmationPage extends BasePage {

  def submit(): Unit =
    click(submitButton)

}
