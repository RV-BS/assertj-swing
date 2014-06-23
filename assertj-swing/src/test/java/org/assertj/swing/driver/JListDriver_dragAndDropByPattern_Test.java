/*
 * Created on Feb 24, 2008
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
 * Copyright @2008-2013 the original author or authors.
 */
package org.assertj.swing.driver;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Tests for {@link JListDriver#drag(javax.swing.JList, Pattern)} and
 * {@link JListDriver#drop(javax.swing.JList, Pattern)}.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class JListDriver_dragAndDropByPattern_Test extends JListDriver_dragAndDrop_TestCase {
  @Test
  public void should_Drag_And_Drop() {
    showWindow();
    driver.drag(list, Pattern.compile("tw.*"));
    driver.drop(dropList, Pattern.compile("s.*"));
    list.requireElements("one", "three");
    dropList.requireElements("four", "five", "six", "two");
    assertThatCellReaderWasCalled();
  }
}
