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

import com.purplepip.exercise.hibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {
  private PersonRepository personRepository;

  @Autowired
  public DataLoader(PersonRepository personRepository) {
    this.personRepository = personRepository;
    load();
  }

  private void load() {
    createPerson("test1");
    createPerson("test2");
    createPerson("test3");
    createPerson("test4");
    createPerson("test5");
  }

  private void createPerson(String name) {
    Person person = new Person();
    person.setName(name);
    personRepository.save(person);
  }
}
