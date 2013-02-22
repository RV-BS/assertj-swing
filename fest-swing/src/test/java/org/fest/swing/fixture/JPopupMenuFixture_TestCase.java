/*
 * Created on Nov 19, 2009
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
package org.fest.swing.fixture;

import static org.fest.swing.test.builder.JPopupMenus.popupMenu;

import javax.swing.JPopupMenu;

import org.fest.swing.driver.JPopupMenuDriver;
import org.junit.BeforeClass;

/**
 * Test cases for {@link JPopupMenuFixture}.
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public abstract class JPopupMenuFixture_TestCase extends AbstractComponentFixture_Implementations_TestCase<JPopupMenu> {
  private static JPopupMenu target;

  private JPopupMenuDriver driver;
  private JPopupMenuFixture fixture;

  @BeforeClass
  public static void setUpTarget() {
    target = popupMenu().createNew();
  }

  @Override
  final void onSetUp() {
    driver = createMock(JPopupMenuDriver.class);
    fixture = new JPopupMenuFixture(robot(), target);
    fixture.driver(driver);
  }

  @Override
  final JPopupMenuDriver driver() {
    return driver;
  }

  @Override
  final JPopupMenu target() {
    return target;
  }

  @Override
  final JPopupMenuFixture fixture() {
    return fixture;
  }
}
