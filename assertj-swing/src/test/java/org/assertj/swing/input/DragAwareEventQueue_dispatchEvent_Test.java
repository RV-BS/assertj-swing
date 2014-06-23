/*
 * Created on Apr 4, 2008
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
package org.assertj.swing.input;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Tests for {@link DragAwareEventQueue#dispatchEvent(java.awt.AWTEvent)}.
 * 
 * @author Alex Ruiz
 */
public class DragAwareEventQueue_dispatchEvent_Test extends DragAwareEventQueue_TestCase {
  @Test
  public void should_Dispatch_Event_If_Event_Is_Not_Native_Drag_And_Drop() {
    MyEvent event = new MyEvent();
    queue.dispatchEvent(event);
    assertThat(event.dispatched).isTrue();
  }
}
