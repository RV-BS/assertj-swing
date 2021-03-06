/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.driver;

import org.assertj.swing.exception.LocationUnavailableException;
import org.junit.Test;

/**
 * Tests for {@link JTreeDriver#drop(javax.swing.JTree, String)}.
 * 
 * @author Alex Ruiz
 */
public class JTreeDriver_dropPath_Test extends JTreeDriver_dragAndDrop_TestCase {
  @Test
  public void should_Throw_Error_If_Path_Does_Not_Exist() {
    showWindow();
    thrown.expect(LocationUnavailableException.class, "Unable to find path 'somePath'");
    driver.drop(tree, "somePath");
  }

  @Test
  public void should_Throw_Error_If_JTree_Is_Disabled() {
    disableTree();
    thrown.expectIllegalStateIsDisabledComponent();
    driver.drop(tree, "root");
  }

  @Test
  public void should_Throw_Error_If_JTree_Is_Not_Showing_On_The_Screen() {
    thrown.expectIllegalStateIsNotShowingComponent();
    driver.drop(tree, "root");
  }
}
