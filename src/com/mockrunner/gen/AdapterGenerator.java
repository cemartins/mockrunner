package com.mockrunner.gen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mockrunner.servlet.ServletTestModule;

public class AdapterGenerator
{
    private final static String SRCDIR = "src";
    
    private List units;
    
    public static void main(String[] args) throws Exception
    {
        AdapterGenerator generator = new AdapterGenerator();
        generator.generate();
    }
    
    public AdapterGenerator()
    {
        units = new ArrayList();
        units.add(new ProcessingUnit(ServletTestModule.class, new StandardAdapterProcessor()));
    }
    
    private void generate() throws Exception
    {
        Iterator iterator = units.iterator();
        while(iterator.hasNext())
        {
            ProcessingUnit nextUnit = (ProcessingUnit)iterator.next();
            AdapterProcessor processor = nextUnit.getProcessor();
            processor.process(nextUnit.getModule());
            writeOutputFile(processor);
        }
    }
    
    private void writeOutputFile(AdapterProcessor processor) throws FileNotFoundException, IOException
    {
        File currentFile = new File(SRCDIR + "/" + processor.getName());
        FileOutputStream currentStream = new FileOutputStream(currentFile);
        Writer currentWriter = new OutputStreamWriter(currentStream, Charset.forName("ISO-8859-1"));
        currentWriter.write(processor.getOutput());
        currentWriter.flush();
        currentWriter.close();
    }

    private class ProcessingUnit
    {
        private Class module;
        private AdapterProcessor processor;
        
        public ProcessingUnit(Class module, AdapterProcessor processor)
        {
            this.module = module;
            this.processor = processor;
        }
        
        public Class getModule()
        {
            return module;
        }
        
        public AdapterProcessor getProcessor()
        {
            return processor;
        }
    }
}