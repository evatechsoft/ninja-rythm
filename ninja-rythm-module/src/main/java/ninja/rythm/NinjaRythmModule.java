/**
 * Copyright (C) 2013 the original author or authors.
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

package ninja.rythm;

import com.google.inject.Scopes;
import ninja.rythm.template.TemplateEngineRythm;
import ninja.template.TemplateEngine;

import org.rythmengine.RythmEngine;

import com.google.inject.AbstractModule;

/**
 * 
 * Bindings for Rythm template engine
 * 
 * @author sojin
 *
 */
public class NinjaRythmModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(RythmEngine.class).toProvider(RythmEngineProvider.class);
        bind(TemplateEngine.class).to(TemplateEngineRythm.class);
    }
}
