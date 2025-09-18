/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package specs

import models.Address
import pages._


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
      BusinessDatePage.pageTitle() shouldBe "What is the Date that your business started trading?"

      Then("The user clicks the submit button")
      BusinessDatePage.submit(1, 10, 1990)

      Given("The user is on the business address page")
      BusinessAddressPage.pageTitle() shouldBe "What is the address of your business?"

      Then("The user clicks the submit button")
      val testAddress = Address("123", "Test Street", "Test City", "Testshire", "TE5 7ED")
      BusinessAddressPage.submit(testAddress)

      Given("The user is on the check your answers page")
      CheckAnswersPage.pageTitle() shouldBe "Check your answers"

      Then("The user clicks the submit button")
      CheckAnswersPage.submit()

      Given("The user is on the confirmation page")
      CheckConfirmationPage.pageTitle() shouldBe "Registration Complete"

      Then("The user clicks the submit button")
      CheckConfirmationPage.submit()

      IndexPage.pageTitle() shouldBe "Welcome to the Boiled Sweet Tax registration service"





    }

    Scenario("A user wants to sign up for Boiled Sweet Tax but is really bad") {

      Given("The user is on the homepage")
      IndexPage.navigateTo()
      IndexPage.pageTitle() shouldBe "Welcome to the Boiled Sweet Tax registration service"

      Then("The user clicks the submit button")
      IndexPage.submit()

      Given("The user is on the business name page")
      BusinessNamePage.pageTitle() shouldBe "What is the name of your business?"

      Then("The user clicks the submit button")
      BusinessNamePage.submit("Test AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABusiness")

      Given("The user is on the date of business started page")
      BusinessDatePage.pageTitle() shouldBe "What is the Date that your business started trading?"

      Then("The user clicks the submit button")
      BusinessDatePage.submit(1, -10, 3006445)

      Given("The user is on the date of business started page")
      BusinessDatePage.pageTitle() shouldBe "What is the Date that your business started trading?"

      Given("The user has an error")
      BusinessDatePage.findError shouldBe "There is a problem\nMonth out of range"
    }

    Scenario("A user wants to sign up for Boiled Sweet Tax but business name is already used") {

      Given("The user is on the homepage")
      IndexPage.navigateTo()
      IndexPage.pageTitle() shouldBe "Welcome to the Boiled Sweet Tax registration service"

      Then("The user clicks the submit button")
      IndexPage.submit()

      Given("The user is on the business name page")
      BusinessNamePage.pageTitle() shouldBe "What is the name of your business?"

      Then("The user clicks the submit button")
      BusinessNamePage.submit("Already used")

      Given("The user is on the date of business started page")
      BusinessDatePage.pageTitle() shouldBe "What is the Date that your business started trading?"

      Then("The user clicks the submit button")
      BusinessDatePage.submit(1, 10, 1990)

      Given("The user is on the business address page")
      BusinessAddressPage.pageTitle() shouldBe "What is the address of your business?"

      Then("The user clicks the submit button")
      val testAddress = Address("123", "Test Street", "Test City", "Testshire", "TE5 7ED")
      BusinessAddressPage.submit(testAddress)

      Given("The user is on the check your answers page")
      CheckAnswersPage.pageTitle() shouldBe "Check your answers"

      Then("The user clicks the submit button")
      CheckAnswersPage.submit()

      Given("The user is on the confirmation page")
      CheckConfirmationPage.pageTitle() shouldBe "Registration Complete"

      Then("The user clicks the submit button")
      CheckConfirmationPage.submit()

      IndexPage.pageTitle() shouldBe "Welcome to the Boiled Sweet Tax registration service"

      Then("The user clicks the submit button")
      IndexPage.submit()

      Given("The user is on the business name page")
      CheckErrorPage.pageTitle() shouldBe "What is the name of your business?"

      Then("The user clicks the submit button")
      BusinessNamePage.submit("Already used")

      Given("The user is on the name is used error")
      CheckErrorPage.pageTitle() shouldBe "service error"





    }
  }
