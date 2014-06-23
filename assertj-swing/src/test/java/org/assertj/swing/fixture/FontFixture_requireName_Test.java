/*
 * Created on Apr 16, 2008
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
package org.assertj.swing.fixture;

import org.junit.Test;

/**
 * Tests for {@link FontFixture#requireName(String)}.
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class FontFixture_requireName_Test extends FontFixture_TestCase {
  @Test
  public void should_Pass_If_Name_Is_Equal_To_Expected() {
    fixture().requireName("SansSerif");
  }

  @Test
  public void should_Fail_If_Name_Is_Not_Equal_To_Expected() {
    expectAssertionError("name", "[Monospace]", "[SansSerif]");
    fixture().requireName("Monospace");
  }

  @Test
  public void should_Fail_Showing_Description_If_Name_Is_Not_Equal_To_Expected() {
    expectAssertionError("test - name", "[Monospace]", "[SansSerif]");
    FontFixture fixture = new FontFixture(font(), "test");
    fixture.requireName("Monospace");
  }
}
