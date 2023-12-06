<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_VerifyLoginSuite using DataDriven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>33179729-6928-4e40-a2f3-ea1bfafe69d9</testSuiteGuid>
   <testCaseLink>
      <guid>883b3d55-d38d-4e14-894e-91b51b9aec69</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login Page/Verify login - Basic</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>ec469e52-1fd8-4c0c-8496-928fd07ccd07</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login Page/Verify login using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ff843192-0713-447f-8b21-4452a755ba41</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/dataLogin_excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ff843192-0713-447f-8b21-4452a755ba41</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>6cbfb2ec-d60a-4066-b5bb-649777ce1c69</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ff843192-0713-447f-8b21-4452a755ba41</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>pwd</value>
         <variableId>73b146e1-cd77-4d2c-a1a7-eecf0fc32453</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ff843192-0713-447f-8b21-4452a755ba41</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_msg</value>
         <variableId>c0e918a5-75d3-4ea6-a34a-8f959f3be439</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
