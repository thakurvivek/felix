/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.framework.resolver;

import java.util.List;
import org.apache.felix.framework.capabilityset.Directive;
import org.apache.felix.framework.capabilityset.Requirement;
import org.apache.felix.framework.capabilityset.SimpleFilter;

class WrappedRequirement implements Requirement
{
    private final Module m_module;
    private final Requirement m_req;

    public WrappedRequirement(Module module, Requirement req)
    {
        m_module = module;
        m_req = req;
    }

    public Requirement getWrappedRequirement()
    {
        return m_req;
    }

    public Module getModule()
    {
        return m_module;
    }

    public String getNamespace()
    {
        return m_req.getNamespace();
    }

    public SimpleFilter getFilter()
    {
        return m_req.getFilter();
    }

    public boolean isOptional()
    {
        return m_req.isOptional();
    }

    public Directive getDirective(String name)
    {
        return m_req.getDirective(name);
    }

    public List<Directive> getDirectives()
    {
        return m_req.getDirectives();
    }

    public String toString()
    {
        return "[" + m_module + "] " + getNamespace() + "; " + getFilter().toString();
    }
}