/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.rack;

/**
 * A Rack application.
 *
 * @see <a href="http://rack.rubyforge.org/doc/SPEC.html">The Rack Specification</a>
 */
public interface RackApplication {
  /**
   * Processes a single HTTP request.
   *
   * @param environment the HTTP request environment.
   * @return the HTTP response.
   */
  RackResponse call(RackEnvironment environment);
}
