/*
 * Copyright 2012 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jberger.todolist.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    
    @Test
    public void testGetDescription() {
        String expected = "Laver la vaisselle";
        Task task = new Task(expected, "2012-11-19", false);
        assertEquals(expected, task.getDescription());
    }
    
    @Test
    public void testGetDate() {
        String expected = "2012-11-19";
        Task task = new Task("Test", expected, false);
        assertEquals(expected, task.getDate());
    }
    
    @Test
    public void testIsDone() {
        boolean expected = false;
        Task task = new Task("Test", "2012-11-19", expected);
        assertEquals(expected, task.isDone());
    }
}