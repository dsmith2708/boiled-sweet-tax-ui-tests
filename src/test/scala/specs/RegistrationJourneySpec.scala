/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package specs

import models.Address
import pages.{BusinessAddressPage, BusinessNamePage, CheckAnswersPage, IndexPage}


class RegistrationJourneySpec extends BaseSpec {

  Feature("Journey for Boiled Sweet Tax Registration") {
    Scenario("A user wants to sign up for Boiled Sweet Tax") {

      Given("The user is on the homepage")
      IndexPage.navigateTo()
      IndexPage.pageTitle() shouldBe "Welcome to the Boiled Sweet Tax registration service"

      Then("The user clicks the submit button")
      IndexPage.submit()

      Given("The user is on the business name page")
      BusinessNamePage.pageTitle() shouldBe "What is the name of your business?"

      Then("The user clicks the submit button")
      BusinessNamePage.submit("Test Business")

      Given("The user is on the date of business started page")
      BusinessNamePage.pageTitle() shouldBe "What is the Date that your business started trading?"

      Then("The user clicks the submit button")
      BusinessNamePage.submit("Test Business")

      Given("The user is on the business address page")
      BusinessAddressPage.pageTitle() shouldBe "What is the address of your business?"

      Then("The user clicks the submit button")
      val testAddress = Address("123", "Test Street", "Test City", "Testshire", "TE5 7ED")
      BusinessAddressPage.submit(testAddress)

      Given("The use is on the check your answers page")
      CheckAnswersPage.pageTitle() shouldBe "Check your answers"

      Then("The user clicks the submit button")
      CheckAnswersPage.submit()

    }
  }

}
