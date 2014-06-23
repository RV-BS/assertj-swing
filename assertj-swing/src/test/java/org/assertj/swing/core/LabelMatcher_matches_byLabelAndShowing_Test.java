/*
 * Created on Aug 5, 2009
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
package org.assertj.swing.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Tests for {@link LabelMatcher#matches(java.awt.Component)}.
 * <p>
 * The {@link LabelMatcher} is created through {@link LabelMatcher#LabelMatcher(String, boolean)}, passing {@code true}
 * to indicate that the {@link java.awt.Component} to match must be showing on the screen.
 * </p>
 * 
 * @author Alex Ruiz
 */
public class LabelMatcher_matches_byLabelAndShowing_Test extends LabelMatcher_TestCase {
  @Test
  public void should_Return_False_If_Label_Does_Not_Match() {
    window.display();
    LabelMatcher matcher = new LabelMatcher("b", true);
    assertThat(matcher.matches(window.buttonLabel)).isFalse();
  }

  @Test
  public void should_Return_False_If_Label_Matches_And_Component_Is_Not_Showing() {
    LabelMatcher matcher = new LabelMatcher(LABEL_TEXT, true);
    assertThat(matcher.matches(window.buttonLabel)).isFalse();
  }

  @Test
  public void should_Return_False_If_Nothing_Matches() {
    LabelMatcher matcher = new LabelMatcher("b", true);
    assertThat(matcher.matches(window.buttonLabel)).isFalse();
  }
}
