/*
 * Created on Aug 9, 2009
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
 * Copyright @2009-2013 the original author or authors.
 */
package org.assertj.swing.driver;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Tests for {@link AbstractButtonDriver#requireText(javax.swing.AbstractButton, Pattern)}.
 * 
 * @author Alex Ruiz
 */
public class AbstractButtonDriver_requireTextAsPattern_Test extends AbstractButtonDriver_TestCase {
  @Test
  public void should_Pass_If_Text_Matches_Regex_Pattern() {
    driver.requireText(checkBox, Pattern.compile("Hell."));
  }

  @Test
  public void should_Fail_If_Text_Does_Not_Match_Regex_Pattern() {
    Pattern pattern = Pattern.compile("Bye.");
    thrown.expectAssertionError("text", "Hello", pattern);
    driver.requireText(checkBox, pattern);
  }
}
