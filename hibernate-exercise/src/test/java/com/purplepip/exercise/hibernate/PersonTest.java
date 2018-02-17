/*
 * Copyright (c) 2017 the original author or authors. All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.purplepip.exercise.hibernate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfiguration.class})
public class PersonTest {
  @Autowired
  PersonRepository personRepository;

  @Test
  public void testPerson() {
    Person person = new Person();
    person.setName("test");
    assertEquals("test", person.getName());
  }

  @Test
  public void testMockData() {
    createPerson("test1");
    createPerson("test2");
    createPerson("test3");
    createPerson("test4");
    createPerson("test5");
    assertEquals(5, personRepository.count());
  }

  private void createPerson(String name) {
    Person person = new Person();
    person.setName(name);
    personRepository.save(person);
  }
}