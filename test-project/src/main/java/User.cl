conversation UserUnitTest {
  imports {
    agent Test.Test as f
  }
  type User from User.User {
  }
  type House from User.House {
  }

  agent Reach concerns House {
    initially receives Test.Test.started becomes reached sends Test.Test.finished {
      reached {
      }
    }
  }
  resource /users for UserUnitTest.User offers authenticated ( create read update find delete ) interchanges ( json )
}
