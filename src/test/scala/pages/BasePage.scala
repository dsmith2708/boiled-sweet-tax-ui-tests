/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.component.PageObject

trait BasePage extends PageObject {
  val pageHeading: By = By.tagName("h1")
  protected val continueButton: By = By.id("continue")
  protected val submitButton: By = By.className("govuk-button")

  def pageTitle(by: By = pageHeading): String =
    getText(by)
}
