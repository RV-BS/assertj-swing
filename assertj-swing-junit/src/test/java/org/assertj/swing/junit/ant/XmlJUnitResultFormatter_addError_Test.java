/*
 * Created on Aug 24, 2009
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2009 the original author or authors.
 */
package org.assertj.swing.junit.ant;

import static org.assertj.core.api.Assertions.assertThat;
import junit.framework.AssertionFailedError;

import org.assertj.swing.junit.xml.XmlNode;
import org.junit.Test;

/**
 * Tests for <code>{@link XmlJUnitResultFormatter#addError(junit.framework.Test, Throwable)}</code>.
 * 
 * @author Alex Ruiz
 */
public class XmlJUnitResultFormatter_addError_Test extends XmlJUnitResultFormatter_TestCase {

  @Test
  public void should_Write_Test_Execution_When_Error_Is_Thrown() {
    startSuite();
    junit.framework.Test test = mockTest();
    AssertionFailedError error = errorOrFailure();
    formatter.addError(test, error);
    XmlNode root = root();
    assertThatTestCaseNodeWasAddedTo(root, test);
    XmlNode errorNode = firstTestCaseNodeIn(root).child(0);
    assertThat(errorNode.name()).isEqualTo("error");
    assertThatErrorOrFailureWasWrittenTo(errorNode);
    assertThat(formatter.onFailureOrErrorMethod).wasCalledPassing(test, error, errorNode);
  }
}
