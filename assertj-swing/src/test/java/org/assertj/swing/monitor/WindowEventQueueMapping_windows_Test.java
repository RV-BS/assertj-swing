/*
 * Created on Jul 31, 2009
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
package org.assertj.swing.monitor;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.Window;
import java.util.Collection;

import org.assertj.swing.test.swing.TestWindow;
import org.junit.Test;

/**
 * Tests for {@link WindowEventQueueMapping#windows()}.
 * 
 * @author Alex Ruiz
 */
public class WindowEventQueueMapping_windows_Test extends WindowEventQueueMapping_withWindow_TestCase {
  @Test
  public void should_Return_Windows() {
    TestWindow anotherWindow = MyWindow.createNew(toolkit, getClass());
    mapping.addQueueFor(window);
    mapping.addQueueFor(anotherWindow);
    Collection<Window> windows = mapping.windows();
    assertThat(windows).containsOnly(window, anotherWindow);
  }
}
