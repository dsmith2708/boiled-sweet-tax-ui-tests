/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

import uk.gov.hmrc.configuration.TestEnvironment

object IndexPage extends BasePage {

  def navigateTo(): Unit = get(TestEnvironment.url("boiled-sweet-tax-registration-frontend"))

  def drop(): Unit = get("http://localhost:9002/boiled-sweet-tax-registration/dropData")

  def submit(): Unit =
    click(submitButton)

}
