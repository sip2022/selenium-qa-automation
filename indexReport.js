const report = require('multiple-cucumber-html-reporter');

report.generate({
    jsonDir: './src/test/report/',
    reportPath: './src/test/report/html/',
    reportName: "Reporte Pruebas - Geminis Club",
    metadata:{
        browser: {
            name: 'chrome',
            version: '60'
        },
        device: 'Local test',
        platform: {
            name: 'windows',
            version: '10'
        }
    },
    customData: {
        title: 'Run info',
        data: [
            {label: 'Project', value: 'SIP UNLu 2022'},
            {label: 'Release', value: '1.0.0'},
            {label: 'Cycle', value: '1'},
            {label: 'Execution Start Time', value: new Date().toLocaleDateString()},
            {label: 'Execution End Time', value: new Date().toLocaleDateString()}
        ]
    }
});