/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

object CheckAnswersPage extends BasePage {

  def submit(): Unit =
    click(submitButton)

}
