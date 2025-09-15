/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

import uk.gov.hmrc.configuration.TestEnvironment

object IndexPage extends BasePage {

  def navigateTo(): Unit = get(TestEnvironment.url("boiled-sweet-tax-registration-frontend"))

  def submit(): Unit =
    click(submitButton)

}
