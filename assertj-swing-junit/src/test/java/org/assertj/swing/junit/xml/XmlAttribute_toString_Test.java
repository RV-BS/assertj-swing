/*
 * Created on Apr 12, 2009
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
package org.assertj.swing.junit.xml;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link XmlAttribute#toString()}</code>.
 * 
 * @author Alex Ruiz
 */
public class XmlAttribute_toString_Test {

  private XmlAttribute attribute;

  @Before
  public void setUp() {
    attribute = XmlAttribute.name("firstName").value("Anakin");
  }

  @Test
  public void should_Implement_ToString() {
    assertThat(attribute.toString()).isEqualTo("XmlAttribute[name='firstName',value='Anakin']");
  }
}
