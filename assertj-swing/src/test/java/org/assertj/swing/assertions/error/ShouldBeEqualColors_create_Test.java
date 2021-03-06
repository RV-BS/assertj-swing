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
package org.assertj.swing.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.assertj.core.data.Offset.offset;
import static org.assertj.swing.assertions.data.Point.atPoint;
import static org.assertj.swing.assertions.data.RgbColor.color;
import static org.assertj.swing.assertions.error.ShouldBeEqualColors.shouldBeEqualColors;

import org.assertj.core.description.TextDescription;
import org.assertj.core.error.ErrorMessageFactory;
import org.assertj.core.presentation.StandardRepresentation;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link ShouldBeEqualColors#create(Description)}</code>.
 * 
 * @author Yvonne Wang
 */
public class ShouldBeEqualColors_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeEqualColors(color(0), color(8), atPoint(6, 10), offset(12));
  }

  @Test
  public void should_Create_Error_Message() {
    String message = factory.create(new TextDescription("Test"), new StandardRepresentation());
    assertEquals(
        "[Test] expected:<color[r=0, g=0, b=0]> but was:<color[r=0, g=0, b=8]> at:<[6, 10]> within offset:<12>",
        message);
  }
}
