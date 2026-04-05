import matplotlib.pyplot as plt
x=['monday','tuesday','wednesday','thursday']
y=[10,20,15,25]
plt.plot(x,y,color='blue', marker='o', linestyle='--')
plt.title('Line Plot')
plt.xlabel('Days of the Week')
plt.ylabel('Values')
plt.legend()
plt.grid()

plt.savefig('line_plot.png')
plt.show()