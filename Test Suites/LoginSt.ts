<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>LoginSt</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>7d5b61e8-2458-4716-85b0-b8131f7489e8</testSuiteGuid>
   <testCaseLink>
      <guid>73f9cfe9-84d1-4a51-8f7f-4e4497f1c32e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM/Login/Successfully Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>18a3b127-39b0-41e7-aaa6-277b782cec7b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>827e6eed-45ec-49e5-a567-31011e1f048f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>83170578-075d-4936-9182-f1b40f1723da</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM/Login/User enter incorrect username</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4280813f-6cb0-42f2-af82-127060591604</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>0b2444e3-e5ec-47e6-bebe-6450f654e115</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4f03f3d6-1d8f-4780-9133-31b7bc568eb2</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7f5e3297-9926-44f0-a49b-2e4ffada6839</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM/Login/Users enter incorrect password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fce04434-04c8-4d6a-a30b-bc939e3525d5</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/usernameSource</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>fce04434-04c8-4d6a-a30b-bc939e3525d5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>e327bd7c-cfb4-416e-aa57-835748e36a1f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>962b1c15-3243-4082-8a87-c36c72ca6205</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>37805607-bbe9-4cd1-84bf-258c82ca00aa</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
