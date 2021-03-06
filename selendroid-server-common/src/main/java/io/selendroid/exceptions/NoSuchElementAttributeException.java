/*
 * Copyright 2012-2014 eBay Software Foundation and selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.exceptions;

public class NoSuchElementAttributeException extends RuntimeException {
  private static final long serialVersionUID = -4526232656079801503L;

  public NoSuchElementAttributeException(String message) {
    super(message);
  }

  public NoSuchElementAttributeException(Throwable t) {
    super(t);
  }

  public NoSuchElementAttributeException(String message, Throwable t) {
    super(message, t);
  }
}
